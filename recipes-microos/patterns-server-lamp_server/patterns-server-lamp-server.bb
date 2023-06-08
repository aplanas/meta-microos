SUMMARY = "Web and LAMP Server"
DESCRIPTION = "Software to set up a Web server that is able to serve static, dynamic, and interactive content (like a Web shop). This includes Apache HTTP Server, the database management system MySQL, and scripting languages such as PHP, Python, Ruby on Rails, or Perl."
LICENSE = "MIT"

PV = "20210330"

RPM_NAME = "patterns-server-lamp_server-20210330-4.1.aarch64.rpm"
RPM_HASH = "9924b0ad87fff3899ba63de1b56c6b169cc0013d66086a8e1b6c4e16853969361acae2bf426e0bc0b9a399e2780b88b2899ddd7f1c61f3629d5ee48561a4c4c5"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-openSUSE-lamp_server patterns-server-lamp_server patterns-server-lamp_server(aarch-64)"
RDEPENDS:${PN} += "apache2 pattern()"

inherit rpm
