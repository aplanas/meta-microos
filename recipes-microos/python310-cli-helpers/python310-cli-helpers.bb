SUMMARY = "Helpers for building command-line apps"
DESCRIPTION = "CLI Helpers is a Python package for performing common tasks when \
building command-line apps. It's a helper library for command-line interfaces. \
 \
Libraries like Click <http://click.pocoo.org/5/> and Python Prompt \
Toolkit <https://python-prompt-toolkit.readthedocs.io/en/latest/> are \
tools that help to create quality apps. CLI Helpers complements these \
libraries by wrapping up common tasks in interfaces. \
 \
CLI Helpers is not focused on applications' design patterns or \
frameworks -- it can be used it on its own or in combination with \
other libraries."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "python310-cli-helpers-2.3.0-1.4.noarch.rpm"
RPM_HASH = "3e839d2588b77791223ebe2de584e97fd0989440f1f9f84e24389feedd4ced00ee3da04280671150a74e2ed9266e724e0b6c94938be1048f3a48999c4b73e14c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cli-helpers \
python3.10dist(cli-helpers) \
python310-cli-helpers \
python3dist(cli-helpers)"
RDEPENDS:${PN} += "python(abi) \
python310-Pygments \
python310-configobj \
python310-tabulate \
python310-terminaltables \
python310-wcwidth"

inherit rpm
