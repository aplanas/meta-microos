SUMMARY = "Mycroft Skills Manager"
DESCRIPTION = "msm is Mycroft Skills Manager, a command line tool to install/list/remove \
Mycroft skills."
LICENSE = "Apache-2.0"

PV = "0.8.5"

RPM_NAME = "python311-msm-0.8.5-2.14.noarch.rpm"
RPM_HASH = "39448c04b91d2264320349659a46f701299bb0c8279929f32781f4f2d063b83bdcac848af533a00bae98bdd14cd0b2607cbb5b3b348388863d73fef15ba1b0c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(msm) python311-msm python3dist(msm)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 patch python(abi) python311-GitPython python311-PyYAML python311-fasteners python311-lazy python311-pako python311-requests python311-setuptools python311-typing update-alternatives"

inherit rpm
