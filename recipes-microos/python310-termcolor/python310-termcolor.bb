SUMMARY = "ANSII Color formatting for output in terminal"
DESCRIPTION = "Available text colors: grey, red, green, yellow, blue, magenta, cyan, white. \
Available text highlights: on_grey, on_red, on_green, on_yellow, on_blue, on_magenta, on_cyan, on_white. \
Available attributes: bold, dark, underline, blink, reverse, concealed."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python310-termcolor-2.1.1-1.3.noarch.rpm"
RPM_HASH = "4ee27121c69e60412e3a66cbb8a6ebc8d39c44b8be6196d7adf8496a89ecdf82bf47508d8c2191e6c5dc02095bab92c91553381c6391665f01e6763d753ffb62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-termcolor \
python3.10dist(termcolor) \
python310-termcolor \
python3dist(termcolor)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
