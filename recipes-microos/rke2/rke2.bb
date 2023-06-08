SUMMARY = "Rancher Kubernetes Engine"
DESCRIPTION = "RKE2, also known as RKE Government, is Rancher's next-generation Kubernetes distribution. \
It is a fully conformant Kubernetes distribution that focuses on security and compliance within the U.S. Federal Government sector. \
 \
To meet these goals, RKE2 does the following: \
    Provides defaults and configuration options that allow clusters to pass the CIS Kubernetes Benchmark with minimal operator intervention \
    Enables FIPS 140-2 compliance \
    Supports SELinux policy and Multi-Category Security (MCS) label enforcement \
    Regularly scans components for CVEs using trivy in our build pipeline"
LICENSE = "Apache-2.0"

PV = "1.25.4+rke2r1"

RPM_NAME = "rke2-1.25.4+rke2r1-1.3.aarch64.rpm"
RPM_HASH = "a3bc70ed389ad4cfa1a15e06ec3b5953a33ce508ac2c1fc154e951f7d82f6397d23e7a86c5a1dd44dc54a7441a05acef7e1a984d482f561f72ccf8be078aaea1"

RPROVIDES:${PN} += "rke2 rke2(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
