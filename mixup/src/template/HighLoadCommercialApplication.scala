package template

import execution.HighLoadExecution
import security.CommercialSecurity

class HighLoadCommercialApplication
  extends Application
    with HighLoadExecution
    with CommercialSecurity
