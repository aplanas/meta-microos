SUMMARY = "Project management for data analysis projects"
DESCRIPTION = "Gloo ties together a lot of the data analysis actions that happen \
regularly. It automatically loads data into the IPython environment, \
runs scripts, makes utitlity functions available and more."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "python311-Gloo-0.1.2-3.7.noarch.rpm"
RPM_HASH = "0a738b3895a1ad9e7a25db4d7b773d86602d7a5ebeee1c6a3ccdee791ee5d31405c8d4e5ec4a15363381395f57b8c2ac3b82e7ea46f754f7aec636faeb62d206"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(gloo) python311-Gloo python3dist(gloo)"
RDEPENDS:${PN} += "python(abi) python311-pandas"

inherit rpm
