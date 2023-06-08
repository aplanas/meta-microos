SUMMARY = "Flake8 lint for quotes"
DESCRIPTION = "Flake8 Extension to lint for quotes."
LICENSE = "MIT"

PV = "3.3.2"

RPM_NAME = "python311-flake8-quotes-3.3.2-1.3.noarch.rpm"
RPM_HASH = "c67bc5c1a3d0a7a96e03e13713b17301d04d2c2513f5b78da9b0c028d406260b8815da4b1b53eea92ad0c91d5fe0264e1c837f6d6a638ffa867986b437c004d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flake8-quotes) python311-flake8-quotes python3dist(flake8-quotes)"
RDEPENDS:${PN} += "python(abi) python311-flake8"

inherit rpm
