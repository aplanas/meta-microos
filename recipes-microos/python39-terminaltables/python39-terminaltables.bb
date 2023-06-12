SUMMARY = "Module for generating tables in terminals from a nested list of strings"
DESCRIPTION = "terminaltables draws tables in terminal/console applications from a \
list of lists of strings, and supports multi-line rows."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python39-terminaltables-3.1.0-2.15.noarch.rpm"
RPM_HASH = "de5e374ea282f592640fb4ed564eccb75fb78f26064a79b222330ce5f07a2814b1d91d0558c79e9db33c60014e3cdf068a0232f5803b3cb66146ec14037eddaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(terminaltables) \
python39-terminaltables \
python3dist(terminaltables)"
RDEPENDS:${PN} += "python(abi) \
python39-colorama \
python39-colorclass \
python39-termcolor"

inherit rpm
