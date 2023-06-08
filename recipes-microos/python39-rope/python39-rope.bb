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

RPM_NAME = "python39-rope-1.6.0-1.4.noarch.rpm"
RPM_HASH = "d879b7ba5f47f799d15f543d7e9553c424862b911e8794a1010064774e12eb2d47d9b35fda9319a92f2f7b7509d0f4b3179fdc4c41f38ff0d2c295b1b935bc34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(rope) python39-rope python3dist(rope)"
RDEPENDS:${PN} += "python(abi) python39 python39-pytoolconfig-global"

inherit rpm
