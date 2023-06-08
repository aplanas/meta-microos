SUMMARY = "File system general utilities"
DESCRIPTION = "Pattern matching and various utilities for file systems paths."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python310-pathtools-0.1.2-14.17.noarch.rpm"
RPM_HASH = "305641b73cdb07714d524a899a33002a6d4d36ef1149047e4a757506c57effe390a0c18bdc73183f9d14541ef3d448abb2099c3e2955b37620be6e4792c8e3fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pathtools python3.10dist(pathtools) python310-pathtools python3dist(pathtools)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
