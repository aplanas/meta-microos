SUMMARY = "Velero plugin for GCP"
DESCRIPTION = "Plugins to support Velero on Google Cloud Platform (GCP)"
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "velero-plugin-for-gcp-1.4.0-1.7.aarch64.rpm"
RPM_HASH = "3681124df4e402ae35dbaf2c76f00ad710fb7bd01e952b2cae70303042f81f131b6138bdd876d7a8a3493849e8d6837235e5af619ce8fa64a2dbd1609315171e"

RPROVIDES:${PN} += "velero-plugin-for-gcp velero-plugin-for-gcp(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
