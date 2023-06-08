SUMMARY = "Warewulf documentation and install recipes"
DESCRIPTION = "Warewulf is a scalable systems management suite originally developed to \
manage large high-performance Linux clusters. Focused on general \
scalable system management, it includes a framework for system \
configuration, management, provisioning/installation, monitoring, event \
notification, and more via a modular plugin architecture. \
 \
This package contains documentation for Warewulf, and installation \
recipes to assist in the deployment of a Warewulf cluster."
LICENSE = "BSD-3-Clause-LBNL"

PV = "3.8.1"

RPM_NAME = "warewulf-doc-3.8.1-7.6.noarch.rpm"
RPM_HASH = "476a7a833e7686c61c3b739c765ed4167fdabde8c4ac9c0362b3a8c3730857ba449646193eccfee48d039ea3978b6e0c5e4d7464f0365d87d41c28a3a765d150"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "warewulf-doc"
RDEPENDS:${PN} += ""

inherit rpm
