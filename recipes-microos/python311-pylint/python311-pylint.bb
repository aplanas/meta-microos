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

RPM_NAME = "python311-pylint-2.17.2-1.1.noarch.rpm"
RPM_HASH = "577f614a67f6b090ca9ea078989f5cf99c77dfad661aef36dfd14ef172642ed5b7acdce694821050965da61601c31f5841ca961290bb11f6171db5c5241ddb20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pylint) python311-pylint python3dist(pylint)"
RDEPENDS:${PN} += "(python311-astroid >= 2.15.2 with python311-astroid < 2.17.0~dev0) (python311-isort >= 4.2.5 with python311-isort < 6) (python311-mccabe >= 0.6 with python311-mccabe < 0.8) /bin/sh /usr/bin/python3.11 python(abi) python311-dill python311-platformdirs python311-tomlkit update-alternatives"

inherit rpm
