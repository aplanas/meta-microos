SUMMARY = "Syntax and style checker for Python code"
DESCRIPTION = "Pylint analyzes Python source code looking for bugs and signs of poor \
quality. \
 \
Pylint is a python tool that checks if a module satisfies a coding \
standard. Pylint can be seen as another PyChecker since nearly all \
tests you can do with PyChecker can also be done with Pylint. But \
Pylint offers some more features, like checking line-code's length, \
checking if variable names are well-formed according to your coding \
standard, or checking if declared interfaces are truly implemented, and \
much more (see the complete check list). \
 \
The big advantage with Pylint is that it is highly configurable, \
customizable, and you can easily write a small plugin to add a personal \
feature."
LICENSE = "GPL-2.0-or-later"

PV = "2.17.2"

RPM_NAME = "python39-pylint-2.17.2-1.1.noarch.rpm"
RPM_HASH = "2963f4bd38734589648b0bfa0c68cddb863da022b6d192577f20ab60e4e64d7e0147098016e7ca38c5ec90b29f362f1d50b772265898b22fa13002e232336573"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pylint) python39-pylint python3dist(pylint)"
RDEPENDS:${PN} += "(python39-astroid >= 2.15.2 with python39-astroid < 2.17.0~dev0) (python39-isort >= 4.2.5 with python39-isort < 6) (python39-mccabe >= 0.6 with python39-mccabe < 0.8) /bin/sh /usr/bin/python3.9 python(abi) python39-dill python39-platformdirs python39-tomli python39-tomlkit python39-typing-extensions update-alternatives"

inherit rpm
