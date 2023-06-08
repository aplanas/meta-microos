SUMMARY = "A library to create a command-line program from a function"
DESCRIPTION = "Autocommand turns a function into a command-line program. It converts the function's parameter \
signature into command-line arguments, and automatically runs the function if the module was \
called as __main__. In effect, it lets your create a smart main function."
LICENSE = "LGPL-3.0-only"

PV = "2.2.2"

RPM_NAME = "python310-autocommand-2.2.2-2.1.noarch.rpm"
RPM_HASH = "06f71b34f864cd50a21f27f6defe84d366336338533b5087ce471726af94bded7d7eb6e39e056dd351c55bcae1a47873b41c6cae7343d076a18f9d45216f2915"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-autocommand python3.10dist(autocommand) python310-autocommand python3dist(autocommand)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
