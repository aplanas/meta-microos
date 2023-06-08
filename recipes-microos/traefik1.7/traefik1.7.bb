SUMMARY = "The Cloud Native Application Proxy"
DESCRIPTION = "Traefik (pronounced traffic) is a modern HTTP reverse proxy and load balancer \
that makes deploying microservices easy. Traefik integrates with your existing \
infrastructure components (Docker, Swarm mode, Kubernetes, Marathon, Consul, \
Etcd, Rancher, Amazon ECS) and configures itself automatically and dynamically. \
 \
Pointing Traefik at your orchestrator should be the only configuration step you need."
LICENSE = "MIT"

PV = "1.7.30"

RPM_NAME = "traefik1.7-1.7.30-2.9.aarch64.rpm"
RPM_HASH = "7ef5fc30bd3ed1cd06517dd3e0cce7d0e4e88ca0579674caea8612a01c3cb249dfce8acf3768c46ae0856bf12554268d46f30032a0570f36ab3b5263771c6c81"

RPROVIDES:${PN} += "config(traefik1.7) traefik1.7 traefik1.7(aarch-64)"
RDEPENDS:${PN} += "/bin/sh systemd"

inherit rpm
