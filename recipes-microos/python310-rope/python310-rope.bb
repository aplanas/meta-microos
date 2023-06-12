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

RPM_NAME = "python310-rope-1.6.0-1.4.noarch.rpm"
RPM_HASH = "0fe61b9a705eb7159b07952d8b2f2c62353ff6e5294603a4deece8249da1c635e6b2beacece17b4f7e7d5b1877770c533aea88b8258189ac0fafb8cefa12a12b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rope \
python3.10dist(rope) \
python310-rope \
python3dist(rope)"
RDEPENDS:${PN} += "python(abi) \
python310 \
python310-pytoolconfig-global"

inherit rpm
