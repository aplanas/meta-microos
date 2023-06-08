SUMMARY = "Java standard interface for CSS parser"
DESCRIPTION = "SAC is a standard interface for CSS parsers, intended to work with CSS1, CSS2, \
CSS3 and other CSS derived languages."
LICENSE = "W3C"

PV = "1.3"

RPM_NAME = "sac-1.3-11.5.noarch.rpm"
RPM_HASH = "4406e60ded7409dc59cf6acaf27ca9a59d06fb42c89f863eaae2a39600873891483e9886641d8b1e188293ab74f5d47bd74af4415181a4bfcf6a7c8eace5e8c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.w3c.css:sac) mvn(org.w3c.css:sac:pom:) osgi(org.w3c.css.sac) sac"
RDEPENDS:${PN} += "java java-headless javapackages-filesystem"

inherit rpm
