SUMMARY = "Re-implementation of zlib in pure Java"
DESCRIPTION = "The zlib is designed to be a free, general-purpose, legally \
unencumbered -- that is, not covered by any patents -- lossless \
data-compression library for use on virtually any computer hardware and \
operating system. The zlib was written by Jean-loup Gailly \
(compression) and Mark Adler (decompression)."
LICENSE = "BSD-3-Clause"

PV = "1.1.3"

RPM_NAME = "jzlib-1.1.3-5.6.noarch.rpm"
RPM_HASH = "e9470ad2bdd8de481b0a781ebc6cc77627256b16d200c5f489bc96ce2d610391ce0c3f730fffc2051e2dd778348839f95699c6995920904b3034658b54ea2508"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jzlib mvn(com.jcraft:jzlib) mvn(com.jcraft:jzlib:pom:) osgi(com.jcraft.jzlib)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
