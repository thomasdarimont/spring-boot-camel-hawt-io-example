package de.tdlabs.eai.examples.hawtio.security.jaas;

import java.security.Principal;

import lombok.Data;
import lombok.NonNull;

@Data
public class GroupPrincipal implements Principal {

    @NonNull
    private final String name;
}
