SUMMARY = "Java library for working with HTML"
DESCRIPTION = "jsoup is a Java library for working with HTML. \
It provides an API for extracting and manipulating data, \
using DOM, CSS, and jquery-like methods. \
 \
jsoup implements the WHATWG HTML5 specification. \
 \
 - scrapes and parses HTML from a URL, file, or string \
 - finds and extracts data, using DOM traversal or CSS selectors \
 - manipulates the HTML elements, attributes, and text \
 - cleans user-submitted content against a safe white-list, \
   to prevent XSS attacks \
 - outputs tidied HTML \
 \
jsoup can deal with invalid HTML tag soup."
LICENSE = "MIT"

PV = "1.15.3"

RPM_NAME = "jsoup-1.15.3-2.2.noarch.rpm"
RPM_HASH = "7d5d66c253337dbbfa38760b3a9e996704de8625725a0dc5dce195c82ec6fea1bcf1e8e821187d6b280f5f9a959cf562145c4e259de2247bc426cbc97951e2ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsoup mvn(org.jsoup:jsoup) mvn(org.jsoup:jsoup:pom:) osgi(org.jsoup)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
