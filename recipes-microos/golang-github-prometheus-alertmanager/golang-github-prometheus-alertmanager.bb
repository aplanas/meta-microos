SUMMARY = "Prometheus Alertmanager"
DESCRIPTION = "The Alertmanager handles alerts sent by client applications such as the \
Prometheus server. It takes care of deduplicating, grouping, and routing \
them to the correct receiver integration such as email, PagerDuty, or \
OpsGenie. It also takes care of silencing and inhibition of alerts."
LICENSE = "Apache-2.0"

PV = "0.25.0"

RPM_NAME = "golang-github-prometheus-alertmanager-0.25.0-1.3.aarch64.rpm"
RPM_HASH = "36e864e325ab81e4691008e60dae579886aaa4e11dee14f35746b1344e6fe63b64bfa36a12161b0ae662e9020d3859f38d27b80ed00fea9ffa4d0443e085561b"

RPROVIDES:${PN} += "config(golang-github-prometheus-alertmanager) golang-github-prometheus-alertmanager golang-github-prometheus-alertmanager(aarch-64) prometheus-alertmanager"
RDEPENDS:${PN} += "/bin/sh group(prometheus) user(prometheus)"

inherit rpm
