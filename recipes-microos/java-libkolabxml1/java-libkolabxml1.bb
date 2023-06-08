SUMMARY = "Java bindings for libkolabxml"
DESCRIPTION = "Libkolabxml serves as a serialization/de-serialization library for the the Kolab XML Format \
 \
Features: \
- Based on official standards: \
- Todos/Events/Journals are fully xCal compliant \
- Contacts/Distributionlists are fully xCard compliant \
- Can model everything which is used in the Kolab XML Format 2.0, Kontact and Roundcube. \
- Easily extensible \
- Canonical storage format \
- Supports Todos/Events/Journals/Contacts/Distribution Lists/Notes/Configurations \
 \
This package provides the java bindings for Libkolabxml"
LICENSE = "LGPL-3.0-or-later"

PV = "1.1.6"

RPM_NAME = "java-libkolabxml1-1.1.6-13.11.aarch64.rpm"
RPM_HASH = "cbfa93094b3cfbbf0ca6beef89b0a86d0641d4e7d6ca39eedca09a75b6bf7f648d5f5c00f3c43935beb2e77c9d6999dd3305a92bb3fcddb2b7875428b1c9613c"

RPROVIDES:${PN} += "java-kolabformat java-libkolabxml1 java-libkolabxml1(aarch-64)"
RDEPENDS:${PN} += "libkolabxml1"

inherit rpm
