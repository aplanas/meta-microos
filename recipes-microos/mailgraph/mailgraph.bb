SUMMARY = "RRDtool frontend for Mail statistics"
DESCRIPTION = "Mailgraph is a very simple mail statistics RRDtool frontend for Postfix \
that produces daily, weekly, monthly and yearly graphs of received/sent \
and bounced/rejected mail (SMTP traffic)."
LICENSE = "GPL-2.0-or-later"

PV = "1.14"

RPM_NAME = "mailgraph-1.14-9.6.noarch.rpm"
RPM_HASH = "1ea9c08f32cb634cd6ab6ccf59c33596949b244856dfcc635322f03d3430ac7c65f671a11142f57c833e34254d4f1ba6252c54e2208078ab3ee507e46d6b8845"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/srv/www/htdocs/css config(mailgraph) mailgraph"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/perl /usr/bin/touch fillup logrotate perl(File::Tail) perl(RRDs) postfix rrdtool systemd"

inherit rpm
