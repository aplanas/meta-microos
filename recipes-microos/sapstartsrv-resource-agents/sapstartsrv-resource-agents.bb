SUMMARY = "Resource agent for SAP instance specific sapstartsrv service"
DESCRIPTION = "This is a resource agent for the instance specific SAP start framework. \
It controls the instance specific sapstartsrv process which provides the \
API to start, stop and check an SAP instance. \
 \
Authors: \
-------- \
    Fabian Herschel \
    Lars Pinne \
    Xabier Arbulu"
LICENSE = "GPL-2.0"

PV = "0.9.2+git.1683278503.846fe15"

RPM_NAME = "sapstartsrv-resource-agents-0.9.2+git.1683278503.846fe15-1.1.noarch.rpm"
RPM_HASH = "c5324e471085800bbddf1379ded91c832d39407b273d71b4a1ddeed43b3bed4b3e379a71f83acf544ffa3faef11b7aaa5e9d228e46df20a44f763cc03f8c2e1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sapstartsrv-resource-agents"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 pacemaker python3 python3-psutil resource-agents"

inherit rpm
