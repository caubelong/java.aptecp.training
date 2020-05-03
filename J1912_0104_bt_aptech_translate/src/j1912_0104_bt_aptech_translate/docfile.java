FileMangement.savePersonToFile(mrLong);
         FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("C://JAVA PROJECT//J1912_0104_bt_aptech_translate//src//j1912_0104_bt_aptech_translate//math.txt");
            br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine()) != null) {

                String[] str = line.split(" ");
                try {
                    Integer.parseInt(str[0]);
                    Integer.parseInt(str[2]);
                } catch (NumberFormatException e) {
                    System.out.println(line + " This is not 2 numbers");
                    continue;
                }
                switch (str[1]) {
                    case "+":
                        System.out.println(line + " = " + (Integer.parseInt(str[0]) + Integer.parseInt(str[2])));
                        break;
                    case "-":
                        System.out.println(line + " = " + (Integer.parseInt(str[0]) - Integer.parseInt(str[2])));
                        break;
                    case "%":
                        System.out.println(line + " = " + Integer.parseInt(str[0]) % Integer.parseInt(str[2]));
                        break;
                    case "*":
                        System.out.println(line + " = " + Integer.parseInt(str[0]) * Integer.parseInt(str[2]));
                        break;
                    case "/":
                        if ("0".equals(str[2])) {
                            System.out.println(line + " Can't div 0");
                        } else {
                            System.out.println(line + " = " + (double) Math.round(Double.parseDouble(str[0]) / Double.parseDouble(str[2]) * 100) / 100);
                        }
                        break;
                    default:
                        System.out.println(line + " is not Math");
                }

            }
        } catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());

        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
                if (br != null) {
                    br.close();
                }

            } catch (IOException e) {
                System.out.println(e.getMessage());

            }
        }
