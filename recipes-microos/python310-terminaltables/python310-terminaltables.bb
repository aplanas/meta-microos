SUMMARY = "Module for generating tables in terminals from a nested list of strings"
DESCRIPTION = "terminaltables draws tables in terminal/console applications from a \
list of lists of strings, and supports multi-line rows."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python310-terminaltables-3.1.0-2.15.noarch.rpm"
RPM_HASH = "308635385a4d61c87e04887d8ed0651a42249be65b37b016c609aecce84a47f82be56c5e11ae4dff91ef001f53235d6104f5305d5f52f60c4d2134019fc5ca16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-terminaltables python3.10dist(terminaltables) python310-terminaltables python3dist(terminaltables)"
RDEPENDS:${PN} += "python(abi) python310-colorama python310-colorclass python310-termcolor"

inherit rpm
