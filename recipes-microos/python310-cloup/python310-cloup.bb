SUMMARY = "Python packages that adds features to Click"
DESCRIPTION = "Adds features to Click: option groups, constraints, subcommand sections and help themes."
LICENSE = "BSD-3-Clause"

PV = "2.0.0.post1"

RPM_NAME = "python310-cloup-2.0.0.post1-1.3.noarch.rpm"
RPM_HASH = "9abf9ad91d8574fa8cc25fe42f9358cbec1150c4b8d244133de12f2d0aea72fc1ea291a836d9d491dec12374c6e7f99208157da2815831cdad2d877eaacae01b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cloup python3.10dist(cloup) python310-cloup python3dist(cloup)"
RDEPENDS:${PN} += "python(abi) python310-click"

inherit rpm
