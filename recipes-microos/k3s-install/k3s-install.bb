SUMMARY = "Installer for k3s optimised for openSUSE MicroOS"
DESCRIPTION = "Based on the official upstream k3s install.sh, this k3s-install \
package provides a curated, MicroOS-optimised, securely delivered \
alternative to running a script directly from the internet. \
 \
k3s is a container orchestration system for automating application \
deployment, scaling, and management. It is a Kubernetes-compliant \
distribution that differs from the original Kubernetes (colloquially \
'k8s') in that: \
 \
  * Legacy, alpha, or non-default features are removed. \
  * Most in-tree plugins (cloud providers and storage plugins) were \
    removed, since they can be replaced with out-of-tree addons. \
  * sqlite3 is the default storage mechanism. \
    etcd3 is still available, but not the default. \
  * There is a new launcher that handles a lot of the complexity of \
    TLS and options."
LICENSE = "Apache-2.0"

PV = "1.24.3+k3s1"

RPM_NAME = "k3s-install-1.24.3+k3s1-1.3.aarch64.rpm"
RPM_HASH = "86d484ccdaaddac4670c884b53d57220c1b9d658d2e536e7537f9a86b3140b5ab37c3d8126add01be34495f0965fb39e6c998b0fbd5e8ed48b9543943ef4c3ce"

RPROVIDES:${PN} += "k3s-install k3s-install(aarch-64)"
RDEPENDS:${PN} += "/bin/sh iptables k3s-selinux"

inherit rpm
