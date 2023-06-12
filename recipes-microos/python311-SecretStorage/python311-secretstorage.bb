SUMMARY = "Python bindings to FreeDesktoporg Secret Service API"
DESCRIPTION = "This module provides a way for securely storing passwords and other secrets. \
 \
It uses D-Bus `Secret Service`_ API that is supported by GNOME Keyring \
(since version 2.30) and KSecretsService. \
 \
The main classes provided are ``secretstorage.Item``, representing a secret \
item (that has a *label*, a *secret* and some *attributes*) and \
``secretstorage.Collection``, a place items are stored in. \
 \
SecretStorage supports most of the functions provided by Secret Service, \
including creating and deleting items and collections, editing items, \
locking and unlocking collections (asynchronous unlocking is also supported). \
 \
The documentation can be found on `pythonhosted.org`_. \
 \
.. _`Secret Service`: https://specifications.freedesktop.org/secret-service/ \
.. _`pythonhosted.org`: https://pythonhosted.org/SecretStorage/"
LICENSE = "BSD-3-Clause"

PV = "3.3.3"

RPM_NAME = "python311-SecretStorage-3.3.3-4.1.noarch.rpm"
RPM_HASH = "1fef79720c9e4efe6d255c998f0964577980003368d07860045aad4acab4a4dccf6ca7d9d4d17444fd04cf60e8b556add86eea3795d18f8e5e3446baa2cc6938"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(secretstorage) \
python311-SecretStorage \
python3dist(secretstorage)"
RDEPENDS:${PN} += "python(abi) \
python311-cryptography \
python311-jeepney"

inherit rpm
