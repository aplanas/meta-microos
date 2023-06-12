SUMMARY = "Flask user session protection"
DESCRIPTION = "Flask-Paranoid is an extension for the Flask framework that protects the \
application against certain attacks in which the user session cookie is stolen \
and then used by the attacker. \
 \
The extension generates a 'paranoid' token according to the IP address and user \
agent when a client connects to the flask application."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-Flask-Paranoid-0.3.0-1.5.noarch.rpm"
RPM_HASH = "0cef103f3d0bf381803a00c5355cf567f4ea70b8e8eeaf46270b5cd10406b431bf1899b99562831fa1130ee6c13e3786f8acb72ebd1d725060976c3f236ae942"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Paranoid \
python3.10dist(flask-paranoid) \
python310-Flask-Paranoid \
python3dist(flask-paranoid)"
RDEPENDS:${PN} += "python(abi) \
python310-Flask"

inherit rpm
