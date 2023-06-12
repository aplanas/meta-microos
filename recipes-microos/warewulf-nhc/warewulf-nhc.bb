SUMMARY = "Warewulf Node Health Check (NHC)"
DESCRIPTION = "Warewulf Node Health Check (NHC) is a periodic 'node health check' script to be \
executed on each compute node to verify that the node is working properly. Nodes \
which are determined to be 'unhealthy' can be marked as down or offline so as to \
prevent jobs from being scheduled or run on them. This helps increase the \
reliability and throughput of a cluster by reducing preventable job failures due \
to misconfiguration, hardware failures, etc."
LICENSE = "BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "warewulf-nhc-1.4.2-1.9.noarch.rpm"
RPM_HASH = "2bd7bc941360b978a0ab8b612e668f2868a7def7de6cb5a22c774a9dc35c1d9bb1ccc18c330e0f46e6280292a42847c37c07c4c3626859f71e09723449b75fc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(warewulf-nhc) \
warewulf-nhc"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
bash \
logrotate"

inherit rpm
