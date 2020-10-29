import template.{DefaultApplication, HighLoadCommercialApplication, HighLoadPresentationalApplication, MediumLoadCommercialApplication, MediumLoadPresentationalApplication}

object Main extends App {
  val hlca = new HighLoadCommercialApplication
  val hlpa = new HighLoadPresentationalApplication
  val mlca = new MediumLoadCommercialApplication
  val mlpa = new MediumLoadPresentationalApplication
  val da = new DefaultApplication

  hlca.start()
  print("\n")
  hlpa.start()
  print("\n")
  mlca.start()
  print("\n")
  mlpa.start()
  print("\n")
  da.start()
}
