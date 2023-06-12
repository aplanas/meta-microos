SUMMARY = "PHP classes to create MIME messages"
DESCRIPTION = "Mail_Mime provides classes to deal with the creation and manipulation \
of MIME messages. It allows to create e-mail messages consisting of \
text parts, HTML parts, inline HTML images, attachments and attached \
(embedded) messages. It supports non-ASCII characters in filenames, \
subjects, recipients, etc."
LICENSE = "BSD-3-Clause"

PV = "1.10.11"

RPM_NAME = "php-pear-Mail_Mime-1.10.11-1.6.noarch.rpm"
RPM_HASH = "1fa64f798a700c765c3b5148dc354e49e381298b566f8b2db822e69dcb4e56996f204daa1cc388ee7f433bbd8c876f0902b6fa6e7176ed24236f5ceea1d94b1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "php-pear(Mail_Mime) \
php-pear-Mail_Mime \
php5-pear-Mail_Mime \
php7-pear-Mail_Mime"
RDEPENDS:${PN} += "/bin/sh \
php-pear"

inherit rpm
