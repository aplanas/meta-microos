SUMMARY = "Javadoc for jafama"
DESCRIPTION = "Javadoc for jafama."
LICENSE = "BSD-3-Clause"

PV = "2.3.1"

RPM_NAME = "jafama-javadoc-2.3.1-1.18.noarch.rpm"
RPM_HASH = "4a6ed8e44b8f2a05f7f14494ad275e5e2366e5eb8264829fad5c5900dabbd44a734817a80746704adcb8f003471958dbab044bf3f94151388230960bcc0479ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jafama-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
