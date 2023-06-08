SUMMARY = "OpenID Connect support for Flask"
DESCRIPTION = "This library should work with any standards compliant OpenID Connect provider. \
 \
It has been tested with: \
* Ipsilon"
LICENSE = "BSD-2-Clause"

PV = "1.4.0"

RPM_NAME = "python310-flask-oidc-1.4.0-5.1.noarch.rpm"
RPM_HASH = "24a023e09138bac6688b5cb804a95c337e0f14ca265dd3da04f63748ab175a0c63013d1e1cd6ca3d99443f292ca7be396264025f697c532cf558ecb8f46c2c4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flask-oidc python3.10dist(flask-oidc) python310-flask-oidc python3dist(flask-oidc)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-Authlib python310-Flask python310-requests update-alternatives"

inherit rpm
