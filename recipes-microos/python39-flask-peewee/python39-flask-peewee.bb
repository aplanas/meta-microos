SUMMARY = "Peewee integration for flask"
DESCRIPTION = "Flask integration for peewee, including admin, authentication, rest api and more."
LICENSE = "MIT"

PV = "3.0.5"

RPM_NAME = "python39-flask-peewee-3.0.5-1.10.noarch.rpm"
RPM_HASH = "5a60735b195ea9107b02bc06d31f11b3286cbecf8eaac8bf486244b8f51793ffc720622de3ec5817ca7bb3cce92a18966881a8ba27c780d6e309b5a995b24fc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flask-peewee) python39-flask-peewee python3dist(flask-peewee)"
RDEPENDS:${PN} += "python(abi) python39-Flask python39-Jinja2 python39-WTForms python39-Werkzeug python39-peewee python39-wtf-peewee"

inherit rpm
