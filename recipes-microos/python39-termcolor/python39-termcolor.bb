SUMMARY = "ANSII Color formatting for output in terminal"
DESCRIPTION = "Available text colors: grey, red, green, yellow, blue, magenta, cyan, white. \
Available text highlights: on_grey, on_red, on_green, on_yellow, on_blue, on_magenta, on_cyan, on_white. \
Available attributes: bold, dark, underline, blink, reverse, concealed."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python39-termcolor-2.1.1-1.3.noarch.rpm"
RPM_HASH = "ff267acc31c28fe4438093caf8c100a0f904c8802d492fd483e77f8458ab845b529d8f481a06f7c6844dd030af5209fbb5b12b8b2c726d10e939c09347935ed0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(termcolor) \
python39-termcolor \
python3dist(termcolor)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
