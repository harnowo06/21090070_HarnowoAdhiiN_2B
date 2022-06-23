public class JSONArrayList {
    public static void main(String[] args) {
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("FOOD", "PIZZA");
        builder.add("Designation", "Java Developer");
        builder.add("Company", "TutorialsPoint");
        JsonArray contactInfo = Json.createArrayBuilder().add(Json.createObjectBuilder().add("email", "PIZZA@gmail.com")).add(Json.createObjectBuilder().add("mobile", "9959984000")).build();
        builder.add("contactInfo", contactInfo);
        JsonObject data = builder.build();
        StringWriter sw = new StringWriter();
        JsonWriter jw = Json.createWriter(sw);
        jw.writeObject(data);
        jw.close();
        System.out.println(sw.toString());
     }
  }
