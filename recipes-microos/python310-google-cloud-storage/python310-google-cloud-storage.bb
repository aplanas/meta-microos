SUMMARY = "Google Cloud Storage API python client library"
DESCRIPTION = "Google Cloud Storage allows you to store data on Google \
infrastructure with very high reliability, performance and \
availability, and can be used to distribute large data objects \
to users via direct download. This package provides client to it."
LICENSE = "Apache-2.0"

PV = "2.8.0"

RPM_NAME = "python310-google-cloud-storage-2.8.0-1.2.noarch.rpm"
RPM_HASH = "d5681817f1ee0135d18a9a1b44c53e2036c1148666e874b1c846efe17ec5abb167074e513d21c6c9e168a9d31762f33ed56b5fc42341501ece848397014d6a82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-storage python3.10dist(google-cloud-storage) python310-google-cloud-storage python3dist(google-cloud-storage)"
RDEPENDS:${PN} += "python(abi) python310-google-api-core python310-google-auth python310-google-cloud-core python310-google-resumable-media python310-googleapis-common-protos python310-requests"

inherit rpm
