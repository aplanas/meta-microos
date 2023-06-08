SUMMARY = "Proxy client for the anonymous proxy system JonDonym"
DESCRIPTION = "JonDo is the local proxy client for JonDonym anonymous webservice. \
JonDonym (the name is derived from John Doe and Anonymous) protects your \
privacy on the Internet and makes truely anonymous using of webservices \
possible. You may use JonDo like a proxy for different web applications. \
For anonymous web surfing we hardly recommend Firefox or Iceweasel \
together with the JonDoFox profile."
LICENSE = "BSD-3-Clause"

PV = "00.20.001"

RPM_NAME = "jondo-00.20.001-1.16.noarch.rpm"
RPM_HASH = "438501ebf57b1d26b10c0a9df4576017307c792613ab353af14faf83cbbf2226fba856d18184d434be0df224555f8fe92a5a07b319ed9d9dd35968eb01ce7da8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(jondo.desktop) jondo"
RDEPENDS:${PN} += "/bin/sh jre"

inherit rpm
