SUMMARY = "Python asyncio SMTP client"
DESCRIPTION = "Python asyncio SMTP client."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python311-aiosmtplib-2.0.1-1.3.noarch.rpm"
RPM_HASH = "d5e12104b331a14cf2073d098d0bac6e3c6e4cb56226dd607151686d11109246c6c1c1bf7ab3839a5528361062eb2f075223a4d3e372ddd21eefb6946227d5d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(aiosmtplib) python311-aiosmtplib python3dist(aiosmtplib)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
