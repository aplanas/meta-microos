SUMMARY = "Program to removes unused Python imports and variables"
DESCRIPTION = "Autoflake removes unused imports and unused variables from Python \
code. It makes use of pyflakes to do this. \
 \
By default, autoflake only removes unused imports for modules that \
are part of the standard library. (Other modules may have side \
effects that make them unsafe to remove automatically.) Removal of \
unused variables is also disabled by default. \
 \
autoflake also removes useless pass statements."
LICENSE = "MIT"

PV = "1.5.3"

RPM_NAME = "python311-autoflake-1.5.3-1.4.noarch.rpm"
RPM_HASH = "6556a449bf86a220265fdc34bc946c69374d7f5ef3b06f9f8b02233e71067e51e73d00c533044e52510c3f2a66dd211219907e6255684f9b58b349da2f86f4fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(autoflake) python311-autoflake python3dist(autoflake)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-pyflakes python311-toml update-alternatives"

inherit rpm
