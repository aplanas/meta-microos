SUMMARY = "Bash completion for whois"
DESCRIPTION = "bash command line completion support for whois."
LICENSE = "GPL-2.0-or-later"

PV = "5.5.16"

RPM_NAME = "whois-bash-completion-5.5.16-1.2.aarch64.rpm"
RPM_HASH = "1f19353a7dcb55cfcc65dd90543686799fa8a1a7ba944ba1f0c7bcc16cdfb8724b8d8451e08230829394ec39842dfd42e0a76988071be98005e0a76fa22f47b6"

RPROVIDES:${PN} += "whois-bash-completion whois-bash-completion(aarch-64)"
RDEPENDS:${PN} += "bash-completion whois"

inherit rpm
