SUMMARY = "📦🐈 Fast, reliable, and secure dependency management"
DESCRIPTION = "Fast: Yarn caches every package it has downloaded, so it never needs to \
download the same package again. It also does almost everything concurrently to \
maximize resource utilization. This means even faster installs. \
 \
Reliable: Using a detailed but concise lockfile format and a deterministic \
algorithm for install operations, Yarn is able to guarantee that any \
installation that works on one system will work exactly the same on another \
system. \
 \
Secure: Yarn uses checksums to verify the integrity of every installed package \
before its code is executed."
LICENSE = "BSD-2-Clause"

PV = "1.22.19"

RPM_NAME = "yarn-1.22.19-1.5.noarch.rpm"
RPM_HASH = "0ff39d35896df3af1d17316c22450b95335f31f66a0e9b1ed6aeeb97d0f003993b403cb747e429a3e6a32ae52dde943306a5097f6d2e0a63120ad0be280151ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yarn"
RDEPENDS:${PN} += "/bin/sh /usr/bin/node nodejs sed"

inherit rpm
