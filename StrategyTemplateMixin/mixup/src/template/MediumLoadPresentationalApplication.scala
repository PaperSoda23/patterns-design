package template

import execution.MediumLoadExecution
import security.PresentationalSecurity

class MediumLoadPresentationalApplication
  extends Application
    with MediumLoadExecution
    with PresentationalSecurity