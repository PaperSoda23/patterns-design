package template

import execution.MediumLoadExecution
import security.CommercialSecurity

class MediumLoadCommercialApplication
  extends Application
    with MediumLoadExecution
    with CommercialSecurity