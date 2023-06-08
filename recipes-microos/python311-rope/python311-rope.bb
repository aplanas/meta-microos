SUMMARY = "A python refactoring library"
DESCRIPTION = "Rope is a python refactoring library. \
 \
* Rope aims to provide powerful and safe refactoring \
* Rope is light on dependency, Rope only depends on Python itself \
* Unlike PyRight or PyLance, Rope does not depend on Node.js \
* Unlike PyLance or PyCharm, Rope is open source. \
* Unlike PyRight and PyLance, Rope is written in Python itself, \
  so if you experience problems, you would be able to debug and \
  hack it yourself in a language that you are already familiar with \
* In comparison to Jedi, Rope is focused on refactoring. While Jedi \
  provides some basic refactoring capabilities, Rope supports many \
  more advanced refactoring operations and options that Jedi does not."
LICENSE = "LGPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "python311-rope-1.6.0-1.4.noarch.rpm"
RPM_HASH = "e230cbd120c94fefd12695f8245680c29ad6bd83904923077b0bee74548eb4d45d73d859296e55f534dc65d4a8f186f66bd583f57a3edd1df652238ff649e852"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(rope) python311-rope python3dist(rope)"
RDEPENDS:${PN} += "python(abi) python311 python311-pytoolconfig-global"

inherit rpm
