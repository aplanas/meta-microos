SUMMARY = "Python Social Auth Core"
DESCRIPTION = "Python Social Auth is a social authentication/registration \
mechanism with support for several frameworks and auth providers. \
 \
This is the core component of the python-social-auth ecosystem. It \
implements the common interface to define new authentication backends to \
third party services, implement integrations with web frameworks and \
storage solutions."
LICENSE = "BSD-3-Clause"

PV = "4.4.2"

RPM_NAME = "python311-social-auth-core-4.4.2-1.1.noarch.rpm"
RPM_HASH = "b890eb013f1d7f9c868555484c5c2a89d931a21f1776c76a9bc0fb0d1de21a20fccb6fd8b0a4be02543ea1f63d4ae7689c56a9c762a2f3e95b2599050ec6802a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(social-auth-core) \
python311-social-auth-core \
python3dist(social-auth-core)"
RDEPENDS:${PN} += "python(abi) \
python311-PyJWT \
python311-cryptography \
python311-defusedxml \
python311-oauthlib \
python311-python3-openid \
python311-requests \
python311-requests-oauthlib"

inherit rpm
