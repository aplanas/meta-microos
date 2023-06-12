SUMMARY = "Local mode for Apache Ivy"
DESCRIPTION = "This meta-package pulls in macros, scripts and dependencies \
implementing local mode for Apache Ivy, which allows \
artifact resolution using XMvn resolver."
LICENSE = "BSD-3-Clause"

PV = "6.1.0"

RPM_NAME = "ivy-local-6.1.0-1.2.noarch.rpm"
RPM_HASH = "5b03b800cd915a4208ab053dc5ff4556733ada99efb7f67c796428bbd9f5d9c9e9fc7edcea8ff70f9340c320759c4fbaf44b9ef77a9dbdf02d211b7ea2e144b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ivy-local"
RDEPENDS:${PN} += "ant \
apache-ivy \
javapackages-ivy \
xmvn-connector-ivy \
xmvn-install \
xmvn-resolve"

inherit rpm
