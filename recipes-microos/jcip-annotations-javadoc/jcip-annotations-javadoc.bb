SUMMARY = "Javadoc for jcip-annotations"
DESCRIPTION = "Class, field, and method level annotations for describing thread-safety \
policies."
LICENSE = "CC-BY-2.5"

PV = "1.0"

RPM_NAME = "jcip-annotations-javadoc-1.0-21.5.noarch.rpm"
RPM_HASH = "c84811de06ba662901caa0aa73d56c7d084d4eb1b2a68a4b3fd08ea1836ce2ed47a02807f70cca117fcdfeeafe17cbd69dc70835813b44a929456477fa724551"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcip-annotations-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
