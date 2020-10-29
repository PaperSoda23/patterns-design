package template

import execution.HighLoadExecution
import security.PresentationalSecurity

class HighLoadPresentationalApplication
  extends Application
    with HighLoadExecution
    with PresentationalSecurity