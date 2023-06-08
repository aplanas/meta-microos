SUMMARY = "web.py: makes web apps"
DESCRIPTION = "Think about the ideal way to write a web app. Write the code to make it happen."
LICENSE = "BSD-3-Clause & SUSE-Public-Domain"

PV = "0.62"

RPM_NAME = "python311-web.py-0.62-3.8.noarch.rpm"
RPM_HASH = "f69cbb3be8cc1921921f1b2f44676b13a738c903381befb0e378199e18a85eb22b214f75b23a3ee171cd748ace178710ce9848b572dd542d57529c4462299b59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(web.py) python311-web.py python3dist(web.py)"
RDEPENDS:${PN} += "python(abi) python311-cheroot"

inherit rpm
