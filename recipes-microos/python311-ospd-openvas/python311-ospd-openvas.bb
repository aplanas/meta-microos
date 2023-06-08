SUMMARY = "An OSP server implementation"
DESCRIPTION = "An OSP server implementation to allow GVM to remotely control OpenVAS."
LICENSE = "AGPL-3.0-or-later"

PV = "22.4.5"

RPM_NAME = "python311-ospd-openvas-22.4.5-1.5.noarch.rpm"
RPM_HASH = "d097948b9422713ad49023a8eb1286c234e4c43b875a3ec7d5b06e3569b66227f1321e6eb0ceac6d04e35bbdea1b355bf156189b13c1f88f84f8b528e19481a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ospd-openvas python3.11dist(ospd-openvas) python311-ospd python311-ospd-openvas python3dist(ospd-openvas)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-defusedxml python311-gnupg python311-lxml python311-packaging python311-paho-mqtt python311-psutil python311-redis"

inherit rpm
